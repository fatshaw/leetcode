https://leetcode.com/problems/container-with-most-water/description/#  
两个指针，l指向数组最左边，r指向数组最右边。计算l和r之间的面积，要想使得l和r之间的面积变大，则只有使得l和r中小的那个变大才行。所以如果l<r，则l向左移动，反之，r向右移动