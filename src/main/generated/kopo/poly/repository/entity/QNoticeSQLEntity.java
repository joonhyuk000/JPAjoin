package kopo.poly.repository.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QNoticeSQLEntity is a Querydsl query type for NoticeSQLEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QNoticeSQLEntity extends EntityPathBase<NoticeSQLEntity> {

    private static final long serialVersionUID = -158923109L;

    public static final QNoticeSQLEntity noticeSQLEntity = new QNoticeSQLEntity("noticeSQLEntity");

    public final StringPath chgDt = createString("chgDt");

    public final StringPath chgId = createString("chgId");

    public final StringPath contents = createString("contents");

    public final NumberPath<Long> noticeSeq = createNumber("noticeSeq", Long.class);

    public final StringPath noticeYn = createString("noticeYn");

    public final NumberPath<Long> readCnt = createNumber("readCnt", Long.class);

    public final StringPath regDt = createString("regDt");

    public final StringPath regId = createString("regId");

    public final StringPath title = createString("title");

    public final StringPath userId = createString("userId");

    public final StringPath userName = createString("userName");

    public QNoticeSQLEntity(String variable) {
        super(NoticeSQLEntity.class, forVariable(variable));
    }

    public QNoticeSQLEntity(Path<? extends NoticeSQLEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QNoticeSQLEntity(PathMetadata metadata) {
        super(NoticeSQLEntity.class, metadata);
    }

}

