https://leetcode.com/problems/counting-bits/description/  
f[i] = f[i/2] + (i & 1)  
将数字k = i>>1，i左移一位后得到k，k一定已经计算过，得到f[k],然后需要加上i的最后一位是不是1，因为左移后最后一位被去掉了，所以可以单独通过i&1来判断最后一位是不是1。