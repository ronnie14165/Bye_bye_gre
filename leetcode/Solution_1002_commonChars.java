package leetcode;

import java.util.ArrayList;
import java.util.List;

public class Solution_1002_commonChars {
    public static List<String> commonChars(String[] A) {
        int small = Integer.MAX_VALUE;
        int num[] = new int[26];
        for (int j = 0; j < A[0].length(); j++) {
            num[(int)(A[0].charAt(j) - 'a')]++;
        }
        List<String> list = new ArrayList<>();
        for (int i = 0; i < num.length; i++) {
            num[i] = small;
        }
        for (int i = 0; i < A.length; i++) {
            int temp[] = new int[26];
            for (int j = 0; j < temp.length; j++) {
                temp[j] = 0;
            }
            for (int j = 0; j < A[i].length(); j++) {
                temp[(int)(A[i].charAt(j) - 'a')]++;

            }
            for (int j = 0; j < temp.length; j++) {
                if (temp[j] < num[j]) {
                    num[j] = temp[j];
                }
            }
        }
        for (int i = 0; i < num.length; i++) {
            if (num[i] == small) {
                num[i] = 0;
            }
        }
        for (int i = 0; i < num.length; i++) {
            while (num[i] > 0) {
                num[i]--;
                list.add(String.valueOf((char)('a' + i)));
            }
        }
        return list;
    }

    public static void main(String[] args) {
        String s[] = {"dbcdjbedfchcbhbecbadeaefefhcaagfghjaidaadeaabaaegj","hfacgbgcieccadeejddegjffejdjegejbaddaiabdhahbjaiba","igfaddihhceieadjgjhefaibcfcichcdecjcihfhcgfjeihidf","jaehjjibbhfdcjjdhecicefjjjdabibahgdaeibfefbbffhjja","degddigjijggagjgaaeeegfiahhcghbefcbdabeehbihjdeabi","bjdfedddebaifgadhgdhfjjdafajhiabbjjiidhcdaagajiafh","ihfjgjjcfeebebjgihdejjdheaeeddiajffjjdbfcfdaabgcei","jdbhhhigagieacgdabbchegdaefgeebaccdeajiifgfecbdgig","djhghabfejhcgbdejfcafjbagecbdggehaaddicgejhdgdahaf","hbaaccbffecibeiabdfeggbahbiehjiejifjjjbbbiiejcejdf","fadeddbhjehehhjiiehigjdaaiaaebjdaicbefacedfcgbegge","djhidhibeghjfbdgabgeejgedifdageichiijachhjfeihfieb","jdiagceichahjbjadhagegbbedhijhgefhfcbhdeefeahghfde","chhbbaeaeacaccbjiegfadfhabbchjggidahbgdhcadafjfifa","cdiabdbeaeefjiaadigdgiihajgcbghcfdhicjjfeiciaidjfh","gfehabegchgidgjbhdighfjbeajhdfaebificjaeahiajjgeab","agafjbjjhadjaichgfihehdhfaiiaffbijeahegjgfcidhhbed","gchagffchcjjadhbhhjfiiagejchbgjabadjcbdigdfdfabgee","ciacjdahajifafhbfbdaddbgbddedhjbbbdbbbfhcidfcbiijg","dbjjbajjgehcbgfaibjjcbigaijdjaagbfbfcjebahjchdfacg","bgfifecddgcfefijhccjiaiedhaeahihehiaedjfebejceibid","hiiigbiddhhejdebjcgjgdfiaijieibbaiibecbjigadejaibj","hafbbjafdjahdhdfiafedjjdgjghcfffcjedgjeffbeahfgbcf","bfcjigdiadjhfjjbghcdhchgaiefdijgcbbcjfaehccgddigah","aehfeiccfieaihijcgfahceadeiffefiegciageeaieghadgda","eafcdbagdafjdbicbabhihfhiefdiehhiiijigfhajfcbgajff","ecgdieegbfcijifhgicihhfhgbebgbjiiegbbfhijbcbecgigd","idhjgaccgaaieidbeidbcadhidhdddgjceccjgehjcidebeidi","bchhdjiiacccidhhcbchehcaddeccfecbcedidhhbjcigddhfg","ieddgabeciffjfchdggifjcebadchbdcdgiagefhecifgifdcj","bedcfhjehehdhafeadbdffbadjhgefjdchjghjedhgadihaedc","cfhcigdaaaddfjifaadejdgdfdfdhfebicfedcefbcgbbdbibh","jbddeaghjegebciaihfjffceiaehgaeecijefafficbajehgej","dbejheeaeadbaifegcjjhahggdbgjbeieghbeijjedjdbfiecc","dgdbefabibgeehgbdjggidagdfhjdgahbjidgejjfgcafcjddf","hcbaggjggcbcgjbceihbghdhbediacdfgfheghddecedddjggf","cdhhaaieachbfgcigidjfjcihecdegifedhadgacieciihafhf","hhicegfcdihbddjaibadeacbjdjjhjdeegjjaedgjegbbbbifg","bjcggafgaajegfcihfaicfhcdfdhgfegjfcbadighbciadhcfd","cabdajhgciaihgdccghbjcbgfighjideehbejjhhihgdjebgje","caaafahejcbedgibhadcfddaejhhaaicejefeghjhijcbfaegd","fggbheafgcbgdcfibiajdachcifhcfdfebbfcjfgefebebbdcc","gdiabbdaicaijehcjhhibbeeidjdjicdbddiaacciehehdbhch","ddbahiacdhccafecfhihfhdeicghdjbfbdehcjdhjhjehdfjhc","hadjggchcjdfaaicggigjgjaeegjfccccejeghbfcgajeccfee","ghcafaieijddfiebcibdccjijafiieeidjdiadbcjhbdjaeiec","gdfjagafhcaihhejfjcjecccfbcidhcidffebcigjdbafjgieh","ifafgibebjghgiaachefhggeibejfdhfaiciighejbiahiihii","caecdaaihahejaidgcecejgcdfhhdeghjacgeaefhjbijbbhgh","hhfdeajjijgeechaieehfcfjaaaadjbejibjfajijcfhicbjhb"};
        //String s[] = {"bella", "label", "roller"};
        System.out.println(commonChars(s));
    }

}
