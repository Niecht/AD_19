package d3;

public class IntHashTable implements HashTable<Integer>{
    Object[] table = new Object[10];

    @Override
    public void add(Integer integer) {
        int index = integer.hashCode();
        if (table[index] == null || table[index] == tombstone){
            table[index] = integer;
        }else{
          this.add(integer, ++index);
        }
    }

    private void add(Integer integer, int index){
        if (table[index] == null || table[index] == tombstone){
            table[index] = integer;
        }else{
            this.add(integer, ++index);
        }
    }

    @Override
    public void delete(Integer integer) {
        int index = integer.hashCode();
    }

    @Override
    public Integer search(Integer integer) {

        return integer;
    }
}

