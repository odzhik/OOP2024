package Lab5;
import Lab5.Animal;
import Lab5.Dog;
import Lab5.Cat;

public class AnimalArrayList {
    private Animal[] arrayList;
    private int size;
    public AnimalArrayList(int initSize) {        arrayList = new Animal[initSize];
    }   public AnimalArrayList() {
        arrayList = new Animal[10];
    }
    public int getSize(){
        return this.size;
    }
    public boolean isEmpty(){
        return this.size == 0;
    }
    private void copyElementsFrom(Animal[] oldElements){
        this.size = oldElements.length;
        for (int i = 0; i < size; i++) {
            oldElements[i] = arrayList[i];
        }        this.arrayList = oldElements;
    }
    public void checkSize(int needCapacity){
        if (size + needCapacity >= (arrayList.length * 0.7)) {
        Animal[] newArray = new Animal[arrayList.length * 2];            copyElementsFrom(newArray);
    }
    }
    public boolean add(Animal element){
        checkSize(1);
        arrayList[size] = element;
        size++;        return true;
    }
    public void set(int index, Animal element){
        arrayList[index] = element;
    }   public Animal get(int index){
        return arrayList[index];    }
    public void clear(){
        for(int i = 0; i < size; i++){
            arrayList[i] = null;
        }
    }
    public String toString(){
        String result = "AnimalArrayList{";
        for (int i = 0; i < size; i++) {
            result += arrayList[i] + " ";
        }
        result += "}";
        return result;    }
}
