package comparable;

public class Employe implements  Comparable<Employe>{
    private int id ;
    private String name;
    private String company;

    Employe(){}

    Employe(int id , String name,String company){
        this.id=id;
        this.name=name;
        this.company=company;
    }

    public int getId() {
        return id;
    }
    public String getName(){
        return name;
    }
    public String getCompany(){
        return company;
    }


    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    public int compareTo(Employe o) {
        return this.getCompany().compareTo(o.getCompany());
    }
    @Override
    public String toString() {
        return  "Id : " + id +"\tName :" + name +"\tComapny : "+ company+"\n";
    }
}
