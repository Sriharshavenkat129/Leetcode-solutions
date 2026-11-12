class Solution {
    public long minimumCost(long cost1, long cost2, long costBoth, long need1, long need2) {
        long minCost = Long.MAX_VALUE;
        
        // Try every possible amount of "both" packages from 0 up to max(need1, need2)
        // Optimization: Since we only need up to max(need1, need2) "both" packages, 
        // we can check the boundary cases or iterate smartly.
        
        // Let's test a few key strategies:
        // Strategy 1: Buy everything using individual type 1 and type 2
        minCost = Math.min(minCost, need1 * cost1 + need2 * cost2);
        
        // Strategy 2: Buy max(need1, need2) using ONLY "both" packages
        long maxNeed = Math.max(need1, need2);
        minCost = Math.min(minCost, maxNeed * costBoth);
        
        // Strategy 3: Mix "both" and individual type 1 (covering all of need2 using both, plus extra need1 if needed)
        if (need1 >= need2) {
            long bothCount = need2;
            long rem1 = need1 - need2;
            long cost = bothCount * costBoth + rem1 * cost1;
            minCost = Math.min(minCost, cost);
        } else {
            long bothCount = need1;
            long rem2 = need2 - need1;
            long cost = bothCount * costBoth + rem2 * cost2;
            minCost = Math.min(minCost, cost);
        }
        
        // Strategy 4: Buy enough "both" packages to cover BOTH needs completely, 
        // even if it means over-buying one type if it's cheaper than buying individually.
        minCost = Math.min(minCost, maxNeed * costBoth);
        
        // Wait, what if buying MORE "both" packages than the max need is cheaper than buying individuals?
        // For example, if costBoth is extremely cheap compared to cost1 and cost2.
        // We can also test buying enough "both" to cover both requirements fully:
        // Actually, max(need1, need2) * costBoth already covers the max requirement. 
        // If we need more of the other, Strategy 3 handles the exact remainder.
        
        // Let's refine Strategy 3 & 4 to cover all mixed integer bounds:
        // for (long both = 0; both <= Math.max(need1, need2); both++) {
        //     long c1 = Math.max(0, need1 - both);
        //     long c2 = Math.max(0, need2 - both);
        //     long total = both * costBoth + c1 * cost1 + c2 * cost2;
        //     minCost = Math.min(minCost, total);
        // }
        
        // Note: The loop above goes up to max(need1, need2), which is at most ~10^5 typically, 
        // making it an O(1) or very fast O(N) check depending on constraints. 
        // If constraints are up to 10^9, we can use math instead of a loop.
        
        return minCost;
    }
}