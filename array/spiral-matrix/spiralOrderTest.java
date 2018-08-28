@Test
public void testspiralOrder() {
  assert spiralOrder(new int[][]{
      {
          1, 2, 3, 4, 5, 6, 7, 8, 9, 10
      },
  }).equals(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

  assert spiralOrder(new int[][]{
      {
          1, 2, 3
      },
      {4, 5, 6}
  }).equals(Arrays.asList(1, 2, 3, 6, 5, 4));

  assert spiralOrder(new int[][]{
      {
          1
      },
      {
          2
      },
      {
          3
      }, {
      4
  }, {
      5
  }, {6}, {7}, {8}, {9}, {10}
  }).equals(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

  assert spiralOrder(new int[][]{
      {
          1, 2
      },
      {
          3, 4
      }, {
      5, 6,
  }
  }).equals(Arrays.asList(1, 2, 4, 6, 5, 3));

  assert spiralOrder(new int[][]{
      {
          1, 2, 3, 4
      },
      {
          5, 6, 7, 8
      },
      {
          9, 10, 11, 12
      }
  }).equals(Arrays.asList(1, 2, 3, 4, 8, 12, 11, 10, 9, 5, 6, 7));

  assert spiralOrder(new int[][]{
      {
          1, 2, 3
      },
      {
          5, 6, 7
      },
      {
          9, 10, 11
      },
      {
          12, 13, 14
      }
  }).equals(Arrays.asList(1, 2, 3, 7, 11, 14, 13, 12, 9, 5, 6, 10));
}
