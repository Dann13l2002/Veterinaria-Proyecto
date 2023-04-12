package Veterinario;
public class Paciente {
    String nombre;
    int telefono;
    String email;
    String nombrepaciente;
    String raza;
    double peso;
    String sexo;
    int edad;
    String alergias;
    String color;

    public Paciente() {
    }

    public Paciente(String nombre, int telefono, String email, String nombrepaciente, String raza, double peso, String sexo, int edad, String alergias, String color) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.email = email;
        this.nombrepaciente = nombrepaciente;
        this.raza = raza;
        this.peso = peso;
        this.sexo = sexo;
        this.edad = edad;
        this.alergias = alergias;
        this.color = color;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNombrepaciente() {
        return nombrepaciente;
    }

    public void setNombrepaciente(String nombrepaciente) {
        this.nombrepaciente = nombrepaciente;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getAlergias() {
        return alergias;
    }

    public void setAlergias(String alergias) {
        this.alergias = alergias;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Paciente{" + "nombre=" + nombre + ", telefono=" + telefono + ", email=" + email + ", nombrepaciente=" + nombrepaciente + ", raza=" + raza + ", peso=" + peso + ", sexo=" + sexo + ", edad=" + edad + ", alergias=" + alergias + ", color=" + color + '}';
    }
    
    
}
