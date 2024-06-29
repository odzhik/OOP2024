package Lab5;
import java.util.ArrayList;

public class AnimalArrayList extends ArrayList<Animal>{
    private Animal[] arrayList;
    private int size;
    public AnimalArrayList(int initSize) {
        arrayList = new Animal[initSize];
    }
    public AnimalArrayList() {
        arrayList = new Animal[3];
    }
    public int getSize(){
        return this.size;
    }
    public boolean isEmpty(){
        return this.size == 0;
    }
    private void copyElementsFrom(Animal[] oldElements) {
        for (int i = 0; i < size; i++) {
            oldElements[i] = arrayList[i];
        }
        arrayList = oldElements; // Update arrayList reference
    }

    public void checkSize(int needCapacity){
        if (size + needCapacity >= (arrayList.length * 0.7)) {
        Animal[] newArray = new Animal[arrayList.length * 2];            copyElementsFrom(newArray);
    }
    }
    public boolean add(Animal element){
        checkSize(1);
        arrayList[size] = element;
        size++;
        return true;
    }
    public Animal set(int index, Animal element){
        arrayList[index] = element;
        return element;
    }
    public Animal get(int index){
        return arrayList[index];
    }
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
        return result;
    }
}
