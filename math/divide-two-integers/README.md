不能用除法，乘法，取模来计算整数除法，只能通过加法来模拟乘法的方式，本题需要注意两点：  
1. 整数的溢出，需要用long来保存，并计算结果和Integer.MAX_INT,Integer.MIN_INT的大小关系
2. 加法的方式，如果10000000/1，每次加一需要加10000000次，过于慢，会超时，所以可以通过每次加上一次和的方式来模拟乘2的效果，加快速度。