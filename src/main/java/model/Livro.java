package model;

import java.util.List;

@Builder
@Data
@ToString(of = {"autor, titulo", "isEmprestado", "isReservado"})
@EqualsAndHashCode(of = {"autor", "titulo", "isEmprestado"})
public class Livro {

      private String autor;
      private String titulo;
      private boolean isEmprestado;
      private boolean isReservado;

      private List<Emprestimo> historico;

      public void adicionarEmprestimoAoHistorico(Emprestimo emprestimo) {
            this.historico.add(emprestimo);
      }
}