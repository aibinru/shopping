package com.shopping.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.shopping.common.utils.PageUtils;
import com.shopping.member.entity.MemberLevelEntity;

import java.util.Map;

/**
 * 会员等级
 *
 * @author abr
 * @email abr@gmail.com
 * @date 2023-07-14 22:10:49
 */
public interface MemberLevelService extends IService<MemberLevelEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

