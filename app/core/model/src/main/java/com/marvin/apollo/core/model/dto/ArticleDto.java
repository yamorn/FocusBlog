package com.marvin.apollo.core.model.dto;

import com.marvin.apollo.core.model.enums.InvisibleStatus;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;

/**
 * @author hufeng
 * @version ArticleDto.java, v 0.1 2019-01-13 20:56 Exp $
 */
@Setter
@Getter
@ToString
public class ArticleDto implements Serializable {
    private Long            id;
    private Long            categoryId;
    private int             refNoteId;
    private int             refBookId;
    private String          categoryName;
    private String          title;
    private String          contentOfMd;
    private String          contentOfHtml;
    private boolean         top;
    private String          tag;
    private int             viewCount;
    private int             likeCount;
    private InvisibleStatus invisibleStatus;
    private Date            createTime;
    private Date            modifiedTime;
}