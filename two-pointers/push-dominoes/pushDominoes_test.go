
func TestPushDominoes(t *testing.T) {
	t.Run("PushDominoes LR should return LR", func(t *testing.T) {
		ret := pushDominoes("LR")
		assert.Equal(t, "LR", ret, "pushDominoes failed")
	})

	t.Run("PushDominoes RL should return RL", func(t *testing.T) {
		ret := pushDominoes("RL")
		assert.Equal(t, "RL", ret, "pushDominoes failed")
	})

	t.Run("PushDominoes LLR should return LLR", func(t *testing.T) {
		ret := pushDominoes("LLR")
		assert.Equal(t, "LLR", ret, "pushDominoes failed")
	})

	t.Run("PushDominoes L.R should return L.R", func(t *testing.T) {
		ret := pushDominoes("L.R")
		assert.Equal(t, "L.R", ret, "pushDominoes failed")
	})

	t.Run("PushDominoes RR.L should return RR.L", func(t *testing.T) {
		ret := pushDominoes("RR.L")
		assert.Equal(t, "RR.L", ret, "pushDominoes failed")
	})

	t.Run("PushDominoes .L.R...LR..L.. should return LL.RR.LLRRLL..", func(t *testing.T) {
		ret := pushDominoes(".L.R...LR..L..")
		assert.Equal(t, "LL.RR.LLRRLL..", ret, "pushDominoes failed")
	})

	t.Run("PushDominoes R. should return RR", func(t *testing.T) {
		ret := pushDominoes("R.")
		assert.Equal(t, "RR", ret, "pushDominoes failed")
	})

	t.Run("PushDominoes ..R.. should return ..RRR", func(t *testing.T) {
		ret := pushDominoes("..R..")
		assert.Equal(t, "..RRR", ret, "pushDominoes failed")
	})
}