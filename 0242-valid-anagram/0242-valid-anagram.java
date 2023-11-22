class Solution {
    public boolean isAnagram(String s, String t) {
          // Cek apakah panjang kedua string sama
        if (s.length() != t.length()) {
            return false;
        }

        // Konversi string ke array karakter
        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();

        // Mengurutkan array karakter
        Arrays.sort(sArray);
        Arrays.sort(tArray);

        // Membandingkan array yang telah diurutkan
        return Arrays.equals(sArray, tArray);
    }
}