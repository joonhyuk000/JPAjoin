package kopo.poly.repository.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QNoticeFetchEntity is a Querydsl query type for NoticeFetchEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QNoticeFetchEntity extends EntityPathBase<NoticeFetchEntity> {

    private static final long serialVersionUID = -1061074937L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QNoticeFetchEntity noticeFetchEntity = new QNoticeFetchEntity("noticeFetchEntity");

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

    public final QUserInfoEntity userInfo;

    public QNoticeFetchEntity(String variable) {
        this(NoticeFetchEntity.class, forVariable(variable), INITS);
    }

    public QNoticeFetchEntity(Path<? extends NoticeFetchEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QNoticeFetchEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QNoticeFetchEntity(PathMetadata metadata, PathInits inits) {
        this(NoticeFetchEntity.class, metadata, inits);
    }

    public QNoticeFetchEntity(Class<? extends NoticeFetchEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.userInfo = inits.isInitialized("userInfo") ? new QUserInfoEntity(forProperty("userInfo")) : null;
    }

}

