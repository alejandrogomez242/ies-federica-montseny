package programacion.iesfm.instituto;

import java.util.Objects;

public class Grupo {
    private int aula;

    public void infoGrupo() {
        System.out.println(aula);
    }

    public Grupo(int aula) {
        this.aula = aula;
    }

    public int getAula() {
        return aula;
    }

    public void setAula(int aula) {
        this.aula = aula;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Grupo grupo = (Grupo) o;
        return aula == grupo.aula;
    }

    @Override
    public int hashCode() {
        return Objects.hash(aula);
    }

    @Override
    public String toString() {
        return "Grupo{" +
                "aula=" + aula +
                '}';
    }
}
