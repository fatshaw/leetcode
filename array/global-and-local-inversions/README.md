local inversion一定是global inversion，但是global不一定是local的，所以如果出现一个global的不是local的情况，那么local和global的数量一定不同。  
所以如果abs(A[i] - i)>1，则表示一定存在global inversion不是local的 