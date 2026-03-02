class Main{
    void main(){
        Id<Integer> id1 = new Id<Integer>(123);
        System.out.println(id1.getId());

        Id<String> id2 = new Id<String>("456");
        System.out.println(id2.getId());
    }
}
class Id<T>{
    private T id;
    Id(T id){
        this.id = id;
    }
    T getId(){
        return this.id;
    }
}
