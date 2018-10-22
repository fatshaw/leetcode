https://leetcode.com/problems/shortest-distance-to-a-character/description/  
计算每个元素到最近的C的距离，先从左往右找，如果遇到C，则force=0，后续force+1，直到再次遇到C。然后再从右往左遍历，更新每个元素距离最近的C的距离