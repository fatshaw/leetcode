https://leetcode.com/problems/boats-to-save-people/description/  
贪心算法  
对数组排序，从hi=len(people),lo=0，hi对应的人可能是一个人一条船，也可能和别人同坐一条船，如果自己一条船，则lo不动，如果和lo一起坐一条船，lo向右边动。
贪心算法证明  
If hi and lo are not in same boat, say in boat-hi and boat-lo respectively, then we can swap hi with lo's boat mate, say m. Obviously, m <= hi, therefore the swap is feasible. Since the swap results no extra boat(s), a new optimal solution T is obtained. That indicates our first step--put hi and lo into same boat--is an optimal step and and greedy choice property also holds.
如果hi和lo不在一条船，比如hi和lo2，lo和hi2，lo < lo2, hi2 < hi， 则可以将hi和hi2交互，对船没有任何影响，所以hi和lo是一种最优解