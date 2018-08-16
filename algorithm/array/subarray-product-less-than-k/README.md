滑动窗口题目
基本思路：对于每一个元素，和该元素之前的元素相乘，直到乘积<k。缺点是存在很多重复计算
优化：通过滑动窗口[left,right]，记录从left到right的乘积，使得left到right的乘积<k，left初始化=0。则right-left+1即以right元素结尾的乘积<k的子序列个数。