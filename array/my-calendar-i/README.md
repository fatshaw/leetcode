https://leetcode.com/problems/my-calendar-i/description/  
排序树问题，根据start将预订进行排序存储，这里使用了TreeMap，key=start，value=end，对于每个预订，通过start找到树的前后结点prev，after。如果prev.end <= start < end <= after.start，则表示增加事件