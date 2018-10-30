https://leetcode.com/problems/fruit-into-baskets/description/  
两个指针，一个指向第一个元素，一个指向第二个元素，同时记录和当前元素相同的个数  
当遇到新的元素和前面的第一、第二元素都不相同，将第二个元素赋值给第一个元素，当前元素作为新的第二个元素，并记录之前第一、二个元素的个数