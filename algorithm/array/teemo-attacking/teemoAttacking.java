public int findPoisonedDuration(int[] timeSeries, int duration) {
  int coldEndTime = 0;
  int coldtime = 0;
  for (int i = 0; i < timeSeries.length; i++) {
      if (coldEndTime > timeSeries[i]) {
          coldtime += duration - (coldEndTime - timeSeries[i]);
      } else {
          coldtime += duration;
      }
      coldEndTime = timeSeries[i] + duration;
  }
  return coldtime;
}