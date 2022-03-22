    public static void sort(int[] array) {
        // Место для вашего алгоритма сортировки
      for (int left = 0; left < array.length; left++) {
	    int value = array[left];
	    int i = left - 1;
	    for (; i >= 0; i--) {
		    if (value < array[i]) {
			  array[i + 1] = array[i];
		    } else {
			    break;
		  }
	  }
	      array[i + 1] = value;
    }
        boolean isSorted = false;
        int buf;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < array.length-1; i++) {
                if(array[i] > array[i+1]){
                    isSorted = false;
 
                    buf = array[i];
                    array[i] = array[i+1];
                    array[i+1] = buf;
                }
            }
        }
    }
