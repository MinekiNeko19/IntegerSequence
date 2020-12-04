import java.util.NoSuchElementException;

public class Range implements IntegerSequence{
  private int start,end,current;

  //@param start : the starting value (inclusive) which must be <= end.
  //@param end : the ending value which is also inclusive.
  public Range(int start,  int end){
    this.start = start;
    this.end = end;
    current = start;
  }

  public void reset(){  }
  public int length(){return 0;  }
  
  //When current is no longer a valid element in the range, it should return false. 
  public boolean hasNext(){return false;  }

  //@throws NoSuchElementException when hasNext() is false.
  //This will return the current value, it will also increase current value by 1. 
  //e.g.  if current is 5. This will make current 6, and return 5. 
  public int next(){return 0;    }
  
  public static void main(String[] args) {
      Range a = new Range(20,40);

      // Testing constructor
      System.out.println(a.start);
      System.out.println(a.end);
      System.out.println(a.current);
    }
  }