0

Run
50
51
52
53
54
55
56
57
58
59
60
61
62
63
64
65
66
67
68
69
70
71
72
73
74
75
76
77
78
79
80
81
82
83
84
85
86
87
88
89
90
91
92
93
94
95
96
97
98
99
100
101
102
103
104
105
106
107
108
▼
▼
▼
▼
▼
▼
▼
▼
▼
▼
▼
▼
▼
▼
import java.util.ArrayList;
                                                                                       // others like this"
  }

  public static int complexId(int postId) {
    int number = postId;
    List<Integer> integers = new ArrayList<Integer>();
    while (number > 0) {
      integers.add(number % 10);
      number = number / 10;
    }

    List<Integer> newIntegers = new ArrayList<Integer>();
    
    for (int i = integers.size() - 1; i >= 0; i--) {
      newIntegers.add(integers.get(i) * integers.get(i));

    }

    String str = new String();
    for (int i = 0; i < newIntegers.size(); i++) {
      str = str + String.valueOf(newIntegers.get(i));
    }

    int i = Integer.parseInt(str);

    return i;
  }

  public static boolean isValid(char[] steps) {
    String string = String.valueOf(steps);
    if (string.length() == 10) {
      int n = 0;
      for (int i = 0; i < string.length(); i++) {

        char c = string.charAt(i);
        if (c == 'n') {
          n++;
        }
        if (c == 's') {
          n--;
        }
        if (c == 'e') {
          n += 2;
        }
        if (c == 'w') {
          n -= 2;
        }
      }
      if (n == 0) {
        return true;
      } else {
        return false;
      }

    } else {
      return false;
    }

  }
}
