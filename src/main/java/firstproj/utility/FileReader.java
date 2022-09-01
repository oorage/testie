package firstproj.utility;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class FileReader {

    private List<String> list;

    public FileReader() {
    }

    public FileReader(String path) throws FileNotFoundException {
        readFromFile(path);
    }

    public List<String> getList() {
        return list;
    }

    public void readFromFile(String path) throws FileNotFoundException {
        //    Scanner scanner = new Scanner(System.in);
        //    System.out.println("Введите путь к файлу:"); // "C://123.txt"
        //    String path = scanner.next();
        File file = new File(path);
        Scanner fr = new Scanner(file);
        List<String> tmp = new ArrayList<>();
        while (fr.hasNext()) {
            tmp.add(fr.next());
        }
        Collections.sort(tmp);
        this.list = tmp;
        //    System.out.println(this.list);
        //    scanner.close();
        fr.close();
    }

    public Map<String, Integer> getStat() {
        Map<String, Integer> stat = new HashMap<>();
        int count;
        for (int i = 0; i < this.list.size(); i++) {
            String tmp = list.get(i);
            count = 0;
            for (int j = 0; j < list.size(); j++) {
                if (Objects.equals(tmp, list.get(j))) {
                    count++;
                }
            }
            stat.put(tmp, count);
        }
        //    System.out.println(stat);
        return stat;
    }

    public Map<String, Integer> maxCount(Map<String, Integer> fullStat) {
        int maxCount = 0;
        Collection<Integer> values = fullStat.values();
        Set<String> tmpSet = fullStat.keySet();
        for (int tmp : values) {
            if (maxCount < tmp) {
                maxCount = tmp;
            }
        }
        Map<String, Integer> maxElements = new HashMap<>();
        for (String tmp : tmpSet) {
            if (fullStat.get(tmp) == maxCount) {
                maxElements.put(tmp, maxCount);
            }
        }
//        System.out.println(tmpSet);
//        System.out.println(values);
//        System.out.println(maxCount);
//        System.out.println(maxElements);
        return maxElements;
    }

}