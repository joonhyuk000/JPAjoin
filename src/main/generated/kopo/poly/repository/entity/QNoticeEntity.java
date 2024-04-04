package kopo.poly.repository.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QNoticeEntity is a Querydsl query type for NoticeEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QNoticeEntity extends EntityPathBase<NoticeEntity> {

    private static final long serialVersionUID = -384194343L;

    public static final QNoticeEntity noticeEntity = new QNoticeEntity("noticeEntity");

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

    public QNoticeEntity(String variable) {
        super(NoticeEntity.class, forVariable(variable));
    }

    public QNoticeEntity(Path<? extends NoticeEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QNoticeEntity(PathMetadata metadata) {
        super(NoticeEntity.class, metadata);
    }

}

