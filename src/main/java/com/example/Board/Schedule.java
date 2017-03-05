package com.example.Board;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;

/**
 * Created by leesunghee on 2017. 3. 5..
 *
 * 두 개의 모델이 1:N관계 입니다. Sosi가 스케줄을 여러개 가질 수 있는 구조입니다.
 * 여기서 Schedule에는 ManyToOne을 걸었는데, @JsonBackReference도 같이 넣었습니다.
 * 이걸 안 넣으면 서로 계속 참조해서 JSON출력할 때 무한루프에 빠지더라구요-_- 이제 Sosi참조는 json에서 안쓰는 그런 옵션 같습니다.
 * 그리고 예전에는 Dao만들어서 뭔가 하이버네이트세션 가져와서 그걸 통해서 했던 것 같은데, Spring Data JPA에서는 JpaRepository라는 것을 제공하는데,
 * 이것을 통하면 해당 모델에 대해서 CRUD를 제공합니다.
 */
@Entity
public class Schedule {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    @JsonBackReference
    private Sosi sosi;

    @Column
    private String program;

    public Schedule() {
    }

    public Schedule(Sosi sosi, String program) {
        this.sosi = sosi;
        this.program = program;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Sosi getSosi() {
        return sosi;
    }

    public void setSosi(Sosi sosi) {
        this.sosi = sosi;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

}