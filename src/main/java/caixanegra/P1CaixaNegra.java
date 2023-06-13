package caixanegra;

public class P1CaixaNegra {

    public float recarrec(String dni, String dia) {
        validarDNI(dni);
        validarDia(dia);

        int diaNum = Integer.parseInt(dia);
        return calcularPercentatgeRecarrec(diaNum);
    }

    private void validarDNI(String dni) {
        if (!dni.matches("\\d+")) {
            throw new IllegalArgumentException("Error: dni ha de ser numèric");
        }

        int dniNum = Integer.parseInt(dni);
        if (dniNum <= 0 || dniNum > 99999999) {
            throw new IllegalArgumentException("Error: dni fora de rang");
        }
    }

    private void validarDia(String dia) {
        if (!dia.matches("\\d+")) {
            throw new IllegalArgumentException("Error: dia ha de ser numèric");
        }

        int diaNum = Integer.parseInt(dia);
        if (diaNum < 1 || diaNum > 31) {
            throw new IllegalArgumentException("Error: dia fora de rang");
        }
    }

    private float calcularPercentatgeRecarrec(int diaNum) {
        if (diaNum >= 1 && diaNum <= 10) {
            return 0f;
        } else if (diaNum >= 11 && diaNum <= 21) {
            return 2.5f;
        } else {
            return 5f;
        }
    }
}
