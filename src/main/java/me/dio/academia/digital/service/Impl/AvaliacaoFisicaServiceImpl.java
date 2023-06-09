package me.dio.academia.digital.service.Impl;

import me.dio.academia.digital.entity.Aluno;
import me.dio.academia.digital.entity.AvaliacaoFisica;
import me.dio.academia.digital.entity.form.AvaliacaoFisicaForm;
import me.dio.academia.digital.entity.form.AvaliacaoFisicaUpdateForm;
import me.dio.academia.digital.repository.AlunoRepository;
import me.dio.academia.digital.repository.AvaliacaoFisicaRepository;
import me.dio.academia.digital.service.IAvaliacaoFisicaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AvaliacaoFisicaServiceImpl implements IAvaliacaoFisicaService
{
    @Autowired
    private AvaliacaoFisicaRepository repository ;

    @Autowired
    private AlunoRepository alunoRepository ;

    @Override
    public AvaliacaoFisica create(AvaliacaoFisicaForm form)
    {
        AvaliacaoFisica avaliacao = new AvaliacaoFisica() ;
        Aluno aluno = alunoRepository.findById(form.getAlunoId()).get() ;
        // aqui deveria lançar uma exceção caso o id não conste no banco

        avaliacao.setAluno(aluno) ;
        avaliacao.setPeso(form.getPeso()) ;
        avaliacao.setAltura(form.getAltura()) ;

        return repository.save(avaliacao) ;
    }

    @Override
    public AvaliacaoFisica get(Long id)
    {
        return null;
    }

    @Override
    public List<AvaliacaoFisica> getAll()
    {
        return null;
    }

    @Override
    public AvaliacaoFisica update(Long id, AvaliacaoFisicaUpdateForm formUpdate)
    {
        return null;
    }

    @Override
    public void delete(Long id)
    {

    }
}
