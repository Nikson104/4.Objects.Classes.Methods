package MyTask2;

public class Main {
    public static void main(String[] args) {
        Patient patient = new Patient();
        String[] allNames = new String[3];
        int[] allAges = new int[3];
        Boolean[] illOrNo = new Boolean[3];
        patient.enterNames (allNames, allAges, illOrNo);
        patient.outputPatients(allNames, allAges, illOrNo);
        System.out.println("Поиск по Имени: ");
        patient.searchByName(allNames,allAges,illOrNo);
        System.out.println("Поиск по Возрасту: ");
        patient.searchByAge(allNames, allAges, illOrNo);
    }
}


