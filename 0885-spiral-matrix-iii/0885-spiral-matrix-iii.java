class Solution {
public:
    vector<vector<int>> spiralMatrixIII(int rows, int cols, int rStart, int cStart) {
        int ele_row{rStart}, ele_col{cStart};
        int max {};
        vector<vector<int>> arr(rows*cols, vector<int>(2));
        int arr_row {}, arr_col{};
        arr[arr_row][arr_col] = ele_row;
        arr[arr_row][arr_col+1] = ele_col;
        if(rows>cols){
            max = rows;
        }else{
            max = cols;
        }
        for(int i {1}; i<2*max; i+=2){
            cout<<i;
            // ...........RIGHT............
            for(int j {1}; j<=i; ++j){
                ++ele_col;
                if(ele_row<rows && ele_col<cols && ele_row>=0 && ele_col>=0){
                    ++arr_row;
                    arr[arr_row][arr_col] = ele_row;
                    arr[arr_row][arr_col+1] = ele_col;
                }
            }

            // ...........DOWN............
            for(int j {1}; j<=i; ++j){
                ++ele_row;
                if(ele_row<rows && ele_col<cols && ele_row>=0 && ele_col>=0){
                    ++arr_row;
                    arr[arr_row][arr_col] = ele_row;
                    arr[arr_row][arr_col+1] = ele_col;
                }
            }

            // ...........LEFT............
            for(int j {1}; j<=i+1; ++j){
                --ele_col;
                if(ele_row<rows && ele_col<cols && ele_row>=0 && ele_col>=0){
                    ++arr_row;
                    arr[arr_row][arr_col] = ele_row;
                    arr[arr_row][arr_col+1] = ele_col;
                }
            }

            // ...........UP............
            for(int j {1}; j<=i+1; ++j){
                --ele_row;
                if(ele_row<rows && ele_col<cols && ele_row>=0 && ele_col>=0){
                    ++arr_row;
                    arr[arr_row][arr_col] = ele_row;
                    arr[arr_row][arr_col+1] = ele_col;
                }
            }
        }
        return arr;
    }
};