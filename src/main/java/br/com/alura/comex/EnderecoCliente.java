package br.com.alura.comex;

public class EnderecoCliente {
    public static class EnderecoCli {
        private String rua;
        private String numero;
        private String bairro;
        private String cidade;
        private String estado;
        private String cep;

        public EnderecoCli(String rua, String numero, String bairro, String cidade, String estado, String cep) {
            this.rua = rua;
            this.numero = numero;
            this.bairro = bairro;
            this.cidade = cidade;
            this.estado = estado;
            this.cep = cep;
        }

        public String getRua() {
            return rua;
        }

        public void setRua(String rua) {
            this.rua = rua;
        }

        public String getNumero() {
            return numero;
        }

        public void setNumero(String numero) {
            this.numero = numero;
        }

        public String getBairro() {
            return bairro;
        }

        public void setBairro(String bairro) {
            this.bairro = bairro;
        }

        public String getCidade() {
            return cidade;
        }

        public void setCidade(String cidade) {
            this.cidade = cidade;
        }

        public String getEstado() {
            return estado;
        }

        public void setEstado(String estado) {
            this.estado = estado;
        }

        public String getCep() {
            return cep;
        }

        public void setCep(String cep) {
            this.cep = cep;
        }

        @Override
        public String toString() {
            return "Endereco{" +
                    "rua='" + rua + '\'' +
                    ", numero='" + numero + '\'' +
                    ", bairro='" + bairro + '\'' +
                    ", cidade='" + cidade + '\'' +
                    ", estado='" + estado + '\'' +
                    ", cep='" + cep + '\'' +
                    '}';
        }
    }

    public static class Cliente {
        private String nome;
        private String cpf;
        private String email;
        private String profissao;
        private String telefone;
        private EnderecoCliente.EnderecoCli endereco;

        public Cliente(String nome, String cpf, String email, String profissao, String telefone, EnderecoCliente.EnderecoCli endereco) {
            this.nome = nome;
            this.cpf = cpf;
            this.email = email;
            this.profissao = profissao;
            this.telefone = telefone;
            this.endereco = endereco;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public String getCpf() {
            return cpf;
        }

        public void setCpf(String cpf) {
            this.cpf = cpf;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getProfissao() {
            return profissao;
        }

        public void setProfissao(String profissao) {
            this.profissao = profissao;
        }

        public String getTelefone() {
            return telefone;
        }

        public void setTelefone(String telefone) {
            this.telefone = telefone;
        }

        public EnderecoCliente.EnderecoCli getEndereco() {
            return endereco;
        }

        public void setEnderecoCli(EnderecoCliente.EnderecoCli endereco) {
            this.endereco = endereco;
        }

        @Override
        public String toString() {
            return "Cliente{" +
                    "nome='" + nome + '\'' +
                    ", cpf='" + cpf + '\'' +
                    ", email='" + email + '\'' +
                    ", profissao='" + profissao + '\'' +
                    ", telefone='" + telefone + '\'' +
                    ", endereco=" + endereco +
                    '}';
        }
    }

}
