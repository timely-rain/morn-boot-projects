package site.morn.constant;

import lombok.experimental.UtilityClass;

/**
 * 持久化操作类型
 *
 * @author timely-rain
 * @since 2.1.0, 2019/7/10
 */
@UtilityClass
public class PersistTypes {

  /**
   * 新增
   */
  public static final String ADD = "add";

  /**
   * 删除
   */
  public static final String DELETE = "delete";

  /**
   * 更新
   */
  public static final String UPDATE = "update";
}
