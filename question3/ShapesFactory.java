package question3;
import java.util.ArrayList;
import java.util.List;
public class ShapesFactory
{
      ArrayList<Shape> slist = new ArrayList<>();  //to store Circle and Rectangle objects.
      public ShapesFactory()  {  }        
      public void addShape(Shape s)
      {
         slist.add(s);
      }
      public List<Circle> getCircles()
      {
         List<Circle> cl=new ArrayList<Circle>();
         for(int i=0;i<slist.size();i++){
         if(slist.get(i) instanceof Circle){
         cl.add((Circle)slist.get(i));
         }
       }
       return cl;
       }
       public List<Rectangle> getRectangles()
       {
          List<Rectangle> rl=new ArrayList<Rectangle>();
          for(int i=0;i<slist.size();i++){
          if(slist.get(i) instanceof Rectangle){
          rl.add((Rectangle)slist.get(i));
          }
        }
        return rl;
        }
        public boolean  deleteShape(Shape s)
        {
            if(slist.contains(s)){
            slist.remove(s);
            return true;
         }
         else{
            return false;
         }
        }
}