package com.example.apiRestBetlab.services;



import com.example.apiRestBetlab.dto.TextSafeDTO;
import com.example.apiRestBetlab.model.TextSafe;
import com.example.apiRestBetlab.repository.TextSafeDao;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@RequiredArgsConstructor
public class TextSafeService {

  // TODO: 14/12/2020  O Autowired deve ser usando no construcctor  e todas as variaveis devem ser delcaradas como final

  private final TextSafeDao dao;


    @Transactional(readOnly = true)
    public Page<TextSafe> findAllPages(Integer page , Integer linesPerPages,String orderBy,String direction){
        PageRequest pageRequest = PageRequest.of(page,linesPerPages, Sort.Direction.valueOf(direction),orderBy);
        return dao.findAll(pageRequest);
    }


    @Transactional(readOnly = true)
    public TextSafeDTO insert (TextSafe entity){

        return SavedTextConverter.convertToDto(dao.save(entity));

    }

}
