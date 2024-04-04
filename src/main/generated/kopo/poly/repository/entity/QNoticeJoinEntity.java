package kopo.poly.repository.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QNoticeJoinEntity is a Querydsl query type for NoticeJoinEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QNoticeJoinEntity extends EntityPathBase<NoticeJoinEntity> {

    private static final long serialVersionUID = -1696268381L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QNoticeJoinEntity noticeJoinEntity = new QNoticeJoinEntity("noticeJoinEntity");

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

    public final QUserInfoEntity userInfoEntity;

    public QNoticeJoinEntity(String variable) {
        this(NoticeJoinEntity.class, forVariable(variable), INITS);
    }

    public QNoticeJoinEntity(Path<? extends NoticeJoinEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QNoticeJoinEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QNoticeJoinEntity(PathMetadata metadata, PathInits inits) {
        this(NoticeJoinEntity.class, metadata, inits);
    }

    public QNoticeJoinEntity(Class<? extends NoticeJoinEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.userInfoEntity = inits.isInitialized("userInfoEntity") ? new QUserInfoEntity(forProperty("userInfoEntity")) : null;
    }

}

