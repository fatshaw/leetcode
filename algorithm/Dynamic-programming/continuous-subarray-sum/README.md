偏数学，对于每一个元素，计算sum=(x+sum)%k，然后如果有相同的sum出现，则表示遍历过程中，出现了k的整数倍和。可以通过使用一个map[sum]=i,记录每个sum出现的index，然后如果下一次出现了sum，计算当前index和map[sum]的差值是不是大于1，如果大于1即为答案