package End2022.Paper2.Q1;

public class Browser {
    Stack permanent;
    Stack temp;
    public Browser(String homepage) {
        this.permanent = new Stack(homepage);
        this.temp = new Stack();
    }

    public void visit(String URL){
        if (temp.top != null && temp.top.getURL().equals(URL)) {
            permanent.push(temp.pop().getURL());
        } else {
            permanent.push(URL);
            temp.top = null;
        }
        System.out.println(permanent.top.getURL());
    }

    public void back(){
        if (permanent.top!=null){
            temp.push(permanent.pop().getURL());
        }
        System.out.println(permanent.top.getURL());
    }

    public void forward(){
        if (temp.top!=null){
            permanent.push(temp.pop().getURL());
            System.out.println(permanent.top.getURL());
        } else System.out.println("cannot move forward");
    }

}
