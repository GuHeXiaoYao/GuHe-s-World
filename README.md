# IoT 平台 Docker 使用说明

## 📁 Docker 文件位置

所有 Docker 相关文件已整理到 `docker/` 文件夹中：

```bash
# 进入 Docker 目录
cd docker

# 查看所有文件
ls -la
```

## 🚀 快速部署

### 1. 构建镜像

```bash
cd docker

# 构建默认版本 (推荐)
./build-docker.sh default local
```

### 2. 启动服务

```bash
# 仅启动应用服务 (当前推荐)
./start-apps.sh

# 或启动完整服务 (需要解决网络问题)
./start-docker.sh
```

## 🌐 访问地址

- **前端界面**: http://localhost:3070
- **后端 API**: http://localhost:9092

## 📋 常用命令

```bash
cd docker

# 查看服务状态
docker-compose -f docker-compose.apps.yml ps

# 查看日志
docker-compose -f docker-compose.apps.yml logs -f

# 停止服务
docker-compose -f docker-compose.apps.yml down
```

## 📚 详细文档

更多详细信息请查看 `docker/README.md` 和 `docker/` 文件夹中的其他文档。

## ⚠️ 注意事项

1. **端口配置**: 后端端口已更新为 9092
2. **数据库初始化**: MySQL 启动后会自动执行 `02-iot.sql` 初始化数据
3. **网络问题**: 如遇镜像拉取失败，请使用 `./build-docker.sh default local`
