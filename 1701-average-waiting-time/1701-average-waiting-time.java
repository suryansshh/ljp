class Solution {
    public double averageWaitingTime(int[][] customers) {
        int totalWaitingTime = 0;
        int currentTime = 0;

        for (int i = 0; i < customers.length; i++) {
            int arrivalTime = customers[i][0];
            int cookingTime = customers[i][1];

            if (currentTime < arrivalTime) {
                currentTime = arrivalTime;
            }

            currentTime += cookingTime;
            int waitingTime = currentTime - arrivalTime;
            totalWaitingTime += waitingTime;
        }

        return (double) totalWaitingTime / customers.length;
    }
}
