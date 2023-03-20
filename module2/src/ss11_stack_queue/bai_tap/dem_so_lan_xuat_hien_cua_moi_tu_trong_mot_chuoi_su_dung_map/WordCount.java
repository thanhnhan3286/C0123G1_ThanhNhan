package ss11_stack_queue.bai_tap.dem_so_lan_xuat_hien_cua_moi_tu_trong_mot_chuoi_su_dung_map;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class WordCount {
    public static void main(String[] args) {
        String str = "Học viên bao gồm các thông tin: Mã, tên, ngày sinh, giới tính, lớp, điểm số";
        String[] words = str.toLowerCase().replaceAll(",", "").split(" ");
        TreeMap<String, Integer> wordCount = new TreeMap<String, Integer>();

        for (String word : words) {
            if (wordCount.containsKey(word)) {
                wordCount.put(word, wordCount.get(word) + 1);
            } else {
                wordCount.put(word, 1);
            }
        }

        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue() + " lần");
        }
    }
}
