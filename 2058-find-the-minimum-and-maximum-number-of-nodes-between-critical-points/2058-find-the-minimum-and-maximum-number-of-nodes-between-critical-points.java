class Solution {
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        int[] result = new int[2];
        result[0] = -1;
        result[1] = -1;

        if (head == null || head.next == null || head.next.next == null) {
            return result;
        }

        ListNode prev = head;
        ListNode curr = head.next;
        int position = 1;
        ArrayList<Integer> criticalPoints = new ArrayList<>();

        while (curr.next != null) {
            position++;
            ListNode next = curr.next;
            if ((curr.val > prev.val && curr.val > next.val) || (curr.val < prev.val && curr.val < next.val)) {
                criticalPoints.add(position);
            }
            prev = curr;
            curr = next;
        }

        if (criticalPoints.size() < 2) {
            return result;
        }

        Collections.sort(criticalPoints);
        int minDistance = Integer.MAX_VALUE;
        for (int i = 1; i < criticalPoints.size(); i++) {
            minDistance = Math.min(minDistance, criticalPoints.get(i) - criticalPoints.get(i - 1));
        }
        int maxDistance = criticalPoints.get(criticalPoints.size() - 1) - criticalPoints.get(0);

        result[0] = minDistance;
        result[1] = maxDistance;

        return result;
    }
}