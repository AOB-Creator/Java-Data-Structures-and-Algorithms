void main() {
//    oopBeginning();
//    leetCode090726();
//    leetCode100726();
//    leetCode130726();
    leetCode140726();
}

public void oopBeginning() {
    Employee emp = new Employee("Alpamis");
    emp.age = 26;
    emp.gender = "Male";
    emp.detailsEmployee();
    emp.age = 25;
    emp.name = "Naurizbek";
    emp.gender = "Male";
    System.out.println(emp.getAllInfo());
    System.out.println("lengthOfLastWord: " + emp.overloader(emp.name));
    System.out.println("lengthOfLastWord: " + emp.overloader(emp.name, emp.age));
}

public void leetCode090726(){
    Leetcode_090726_Tasks leets = new Leetcode_090726_Tasks();

    int[] divi3 = {1,2,3,4};
    System.out.println("minimumOperations: "+ leets.minimumOperations(divi3));

    String text = "   fly me   to   the moon  ";
    int[] arrays = {3,0,1,1,9,7};
    int[][] mats = {{1,2,3}, {4,5,6}, {7,8,9}};

    System.out.println("Self Dividing: " + leets.selfDividingNumbers(47, 85));
    System.out.println("Subtract: " + leets.subtractProductAndSum(4421));
    System.out.println("Maximum possible number: " + leets.maximum69Number(999699969));
    System.out.println("Sorted Array: " + Arrays.toString(leets.sortArray(arrays)));
    System.out.println("lengthOfLastWord: " + leets.lengthOfLastWord(text));
    System.out.println("Number of Good Pairs: " + leets.numIdenticalPairs(arrays));
    System.out.println("Count Good Triplets: " + leets.countGoodTriplets(arrays, 7, 2, 3));

    int[] nums  = {6,5,4,8};
    System.out.println("Shuffled"+ Arrays.toString(leets.shuffle(nums, 2)));
    System.out.println("smallerNumbersThanCurrent: "+ Arrays.toString(leets.smallerNumbersThanCurrent(nums)));

    String[] words = {"gin","zen","gig","msg"};
    System.out.println("uniqueMorseRepresentations: "+ leets.uniqueMorseRepresentations(words));
    System.out.println("diagonalSum: "+ leets.diagonalSum(mats));
    String[] wordsExist = {"leet","code"};
    System.out.println("findWordsContaining: "+ leets.findWordsContaining(wordsExist, 'e'));
}

public void leetCode100726(){
    Leetcode_100726_Tasks leets = new Leetcode_100726_Tasks();
    int[] pivots = {9,12,5,10,14,3,10};

    System.out.println("pivotArray: "+ Arrays.toString(leets.pivotArray(pivots, 10)));
    int[] decompress = {1,1,2,3};
    System.out.println("decompressRLElist: "+ Arrays.toString(leets.decompressRLElist(decompress)));
    int[] digitalArray = {12,54,32,22};
    System.out.println("countDigitOccurrences: " + leets.countDigitOccurrences(digitalArray, 2));
    System.out.println("concatWithReverse: "+ Arrays.toString(leets.concatWithReverse(decompress)));
}

public void leetCode130726(){

    Leetcode_130720_Tasks leets = new Leetcode_130720_Tasks();

    int[][] matrix = {{0,1,0},{1,0,1},{1,1,0}};
    System.out.println("findDegrees: " + Arrays.toString(leets.findDegrees(matrix)));

    String jewels = "aA", stones = "aAAbbbb";
    System.out.println("Jewels and Stones: " + leets.numJewelsInStones(jewels, stones));

    String address = "1.1.1.1";
    System.out.println("1108. Defanging an IP Address: " + leets.defangIPAddress(address));

    String key = "the quick brown fox jumps over the lazy dog", message = "vkbs bs t suepuv";
    System.out.println("1221. Split a String in Balanced Strings: " + leets.decodeMessage(key, message));

}

public void leetCode140726(){
    Leetcode_140726_Tasks leets = new Leetcode_140726_Tasks();

}
