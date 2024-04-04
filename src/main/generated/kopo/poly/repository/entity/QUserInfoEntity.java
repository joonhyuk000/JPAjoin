package kopo.poly.repository.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QUserInfoEntity is a Querydsl query type for UserInfoEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QUserInfoEntity extends EntityPathBase<UserInfoEntity> {

    private static final long serialVersionUID = 1761803482L;

    public static final QUserInfoEntity userInfoEntity = new QUserInfoEntity("userInfoEntity");

    public final StringPath addr1 = createString("addr1");

    public final StringPath addr2 = createString("addr2");

    public final StringPath chgDt = createString("chgDt");

    public final StringPath chgId = createString("chgId");

    public final StringPath email = createString("email");

    public final StringPath password = createString("password");

    public final StringPath regDt = createString("regDt");

    public final StringPath regId = createString("regId");

    public final StringPath roles = createString("roles");

    public final StringPath userId = createString("userId");

    public final StringPath userName = createString("userName");

    public QUserInfoEntity(String variable) {
        super(UserInfoEntity.class, forVariable(variable));
    }

    public QUserInfoEntity(Path<? extends UserInfoEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QUserInfoEntity(PathMetadata metadata) {
        super(UserInfoEntity.class, metadata);
    }

}

