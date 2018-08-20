public int[] advantageCount(int[] A, int[] B) {
  Arrays.sort(A);
  List<int[]> list = new ArrayList<>();
  for (int i = 0; i < B.length; i++) {
      list.add(new int[]{B[i], i});
  }
  list.sort((o1, o2) -> o2[0] - o1[0]);
  int low = 0;
  int high = A.length - 1;
  int[] result = new int[A.length];
  for (int i = 0; i < list.size(); i++) {
      int index = list.get(i)[1];
      int value = list.get(i)[0];
      if (A[high] > value) {
          result[index] = A[high--];
      } else {
          result[index] = A[low++];
      }
  }
  return result;
}

