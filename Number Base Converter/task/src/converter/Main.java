package converter;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.Scanner;

public class Main {
    
    public static void baseConverter() {
        Scanner scanner = new Scanner(System.in);
        BigInteger sourceBase;
        BigInteger targetBase;
        boolean isBack;
        while (true) {
            isBack = false;
            System.out.println("Enter two numbers in format: {source base} {target base} (To quit type /exit)");
            String[] inputs = scanner.nextLine().split(" ");
            if (inputs[0].equals("/exit")) {
                break;
            } else {
                while (!isBack) {
                    sourceBase = new BigInteger(inputs[0]);
                    targetBase = new BigInteger(inputs[1]);
                    System.out.println("Enter number in base " + sourceBase + " to convert to base " + targetBase + " (To go back type /back) ");
                    String input = scanner.next();
                    String integerString;
                    StringBuilder fractionString = new StringBuilder();
                    boolean isFraction = false;
                    if (input.contains(".")) {
                        isFraction = true;
                        integerString = input.substring(0, input.indexOf("."));
                        fractionString = new StringBuilder(input.substring(input.indexOf(".") + 1));
                    } else {
                        integerString = input;
                    }
                    if ("/back".equals(integerString)) {
                        isBack = true;
                        System.out.println();
                    } else {
                        if (!(integerConverter(integerString, sourceBase, targetBase).equals(integerString))) {
                            integerString = integerConverter(integerString, sourceBase, targetBase);
                        }
                        if (isFraction) {
                            fractionString = new StringBuilder(fractionConverter(fractionString.toString(), sourceBase, targetBase));
                        }
                        System.out.print("Conversion result: ");
                        if (integerString.equals("")) {
                            integerString = "0";
                        }
                        if (!isFraction) {
                            System.out.println(integerString);
                        } else {
                            if (fractionString.toString().contains(".")) {
                                fractionString = new StringBuilder(fractionString.substring(fractionString.indexOf(".") + 1).substring(0, 5));
                            }
                            if (fractionString.length() > 5) {
                                fractionString = new StringBuilder(fractionString.substring(0, 5));
                            }
                            if (fractionString.length() < 5) {
                                while (fractionString.length() < 5) {
                                    fractionString.append("0");
                                }
                            }
                            System.out.println(integerString + "." + fractionString);
                        }
                        System.out.println();
                    }
                }
                scanner.nextLine();
            }
        }

    }

    public static String integerBaseConverter(BigInteger number, BigInteger targetBase) {
        StringBuilder convertedNumBuilder = new StringBuilder();
        while (!number.toString().equals("0")) {
            StringBuilder tb = new StringBuilder();
            String digit = String.valueOf(new BigInteger(String.valueOf(number.mod(targetBase))));
            switch (String.valueOf(digit)) {
                case "10":
                    digit = ("a");
                    break;
                case "11":
                    digit = ("b");
                    break;
                case "12":
                    digit = ("c");
                    break;
                case "13":
                    digit = ("d");
                    break;
                case "14":
                    digit = ("e");
                    break;
                case "15":
                    digit = ("f");
                    break;
                case "16":
                    digit = ("g");
                    break;
                case "17":
                    digit = ("h");
                    break;
                case "18":
                    digit = ("i");
                    break;
                case "19":
                    digit = ("j");
                    break;
                case "20":
                    digit = ("k");
                    break;
                case "21":
                    digit = ("l");
                    break;
                case "22":
                    digit = ("m");
                    break;
                case "23":
                    digit = ("n");
                    break;
                case "24":
                    digit = ("o");
                    break;
                case "25":
                    digit = ("p");
                    break;
                case "26":
                    digit = ("q");
                    break;
                case "27":
                    digit = ("R");
                    break;
                case "28":
                    digit = ("S");
                    break;
                case "29":
                    digit = ("t");
                    break;
                case "30":
                    digit = ("u");
                    break;
                case "31":
                    digit = ("v");
                    break;
                case "32":
                    digit = ("w");
                    break;
                case "33":
                    digit = ("x");
                    break;
                case "34":
                    digit = ("y");
                    break;
                case "35":
                    digit = ("z");
                    break;
            }
            tb.append(digit);
            convertedNumBuilder.insert(0, tb);
            number = number.divide(targetBase);
        }
        return convertedNumBuilder.toString();
    }

    public static String fractionBaseConverter(BigDecimal number, BigDecimal targetBase) {
        BigDecimal result;
        StringBuilder convertedNumBuilder = new StringBuilder();
        int count = 0;
        if (number.compareTo(BigDecimal.ZERO) < 1) {
            result = new BigDecimal(convertedNumBuilder.append(number).toString()).setScale(5, RoundingMode.UP);
            return result.toString();
        }
        while (number.compareTo(BigDecimal.ZERO) > 0) {
            if (count < 5) {
                StringBuilder tb = new StringBuilder();
                String fullNum = String.valueOf(new BigDecimal(String.valueOf(number.multiply(targetBase))));
                String digit = "";
                if (fullNum.substring(0, fullNum.indexOf(".")).length() > 0) {
                    digit = fullNum.substring(0, fullNum.indexOf("."));
                }
                switch (digit) {
                    case "10":
                        digit = ("a");
                        break;
                    case "11":
                        digit = ("b");
                        break;
                    case "12":
                        digit = ("c");
                        break;
                    case "13":
                        digit = ("d");
                        break;
                    case "14":
                        digit = ("e");
                        break;
                    case "15":
                        digit = ("f");
                        break;
                    case "16":
                        digit = ("g");
                        break;
                    case "17":
                        digit = ("h");
                        break;
                    case "18":
                        digit = ("i");
                        break;
                    case "19":
                        digit = ("j");
                        break;
                    case "20":
                        digit = ("k");
                        break;
                    case "21":
                        digit = ("l");
                        break;
                    case "22":
                        digit = ("m");
                        break;
                    case "23":
                        digit = ("n");
                        break;
                    case "24":
                        digit = ("o");
                        break;
                    case "25":
                        digit = ("p");
                        break;
                    case "26":
                        digit = ("q");
                        break;
                    case "27":
                        digit = ("R");
                        break;
                    case "28":
                        digit = ("S");
                        break;
                    case "29":
                        digit = ("t");
                        break;
                    case "30":
                        digit = ("u");
                        break;
                    case "31":
                        digit = ("v");
                        break;
                    case "32":
                        digit = ("w");
                        break;
                    case "33":
                        digit = ("x");
                        break;
                    case "34":
                        digit = ("y");
                        break;
                    case "35":
                        digit = ("z");
                        break;
                }
                tb.append(digit);
                convertedNumBuilder.append(tb);
                fullNum = fullNum.substring(fullNum.indexOf("."));
                number = new BigDecimal(fullNum);
                count++;
            } else {
                break;
            }
        }
        return convertedNumBuilder.substring(convertedNumBuilder.toString().indexOf(".") + 1);
    }

    public static String integerConverter(String integerString, BigInteger sourceBase, BigInteger targetBase) {
        BigInteger result = new BigInteger("0");
        int integerPower = 0;
        for (int i = integerString.length() - 1; i >= 0; i--) {
            BigInteger val = BigInteger.valueOf(Integer.parseInt(String.valueOf(integerString.charAt(i)), Integer.parseInt(String.valueOf(sourceBase))));
            result = result.add(sourceBase.pow(integerPower).multiply(val));
            integerPower++;
        }
        if (!targetBase.toString().equals("10")) {
            return integerBaseConverter(result, targetBase);
        }
        return result.toString();
    }

    public static String fractionConverter(String fractionString, BigInteger sourceBase, BigInteger targetBase) {
        BigDecimal result = new BigDecimal("0");
        BigDecimal deciSourceBase = new BigDecimal(sourceBase.toString());
        BigDecimal deciTargetBase = new BigDecimal(targetBase.toString());
        deciSourceBase = BigDecimal.ONE.divide(deciSourceBase, 10, RoundingMode.UP);
        int fractionPower = 1;
        if (!fractionString.equals("")) {
            for (int i = 0; i < fractionString.length(); i++) {
                BigDecimal val = letterConverter(String.valueOf(fractionString.charAt(i)));
                result = result.add(deciSourceBase.pow(fractionPower).multiply(val));
                fractionPower++;
            }
        }
        if (!targetBase.toString().equals("10")) {
            return fractionBaseConverter(result, deciTargetBase);
        }
        return "" + result;
    }

    public static BigDecimal letterConverter(String letter) {
        BigDecimal digit;
        switch (letter) {
            case "a":
                digit = new BigDecimal("10");
                break;
            case "b":
                digit = new BigDecimal("11");
                break;
            case "c":
                digit = new BigDecimal("12");
                break;
            case "d":
                digit = new BigDecimal("13");
                break;
            case "e":
                digit = new BigDecimal("14");
                break;
            case "f":
                digit = new BigDecimal("15");
                break;
            case "g":
                digit = new BigDecimal("16");
                break;
            case "h":
                digit = new BigDecimal("17");
                break;
            case "i":
                digit = new BigDecimal("18");
                break;
            case "j":
                digit = new BigDecimal("19");
                break;
            case "k":
                digit = new BigDecimal("20");
                break;
            case "l":
                digit = new BigDecimal("21");
                break;
            case "m":
                digit = new BigDecimal("22");
                break;
            case "n":
                digit = new BigDecimal("23");
                break;
            case "o":
                digit = new BigDecimal("24");
                break;
            case "p":
                digit = new BigDecimal("25");
                break;
            case "q":
                digit = new BigDecimal("26");
                break;
            case "r":
                digit = new BigDecimal("27");
                break;
            case "s":
                digit = new BigDecimal("28");
                break;
            case "t":
                digit = new BigDecimal("29");
                break;
            case "u":
                digit = new BigDecimal("30");
                break;
            case "v":
                digit = new BigDecimal("31");
                break;
            case "w":
                digit = new BigDecimal("32");
                break;
            case "x":
                digit = new BigDecimal("33");
                break;
            case "y":
                digit = new BigDecimal("34");
                break;
            case "z":
                digit = new BigDecimal("35");
                break;
            default:
                digit = BigDecimal.valueOf(Long.parseLong(letter));
                break;
        }
        return digit;
    }

    public static void main(String[] args) {
        baseConverter();
    }
}
