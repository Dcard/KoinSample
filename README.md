# KoinSample

用來介紹如何/為何使用 Koin 的 Sample Project
有不同的階段，從一完全沒有 injection 概念，然後建立 DI 的概念，最後使用 Koin 實作 DI

## Branches
- branch_1: 最基本的樣子
- branch_2: 建立獨立的 object 統一處理 business logic
- branch_3: 使用 Dependency Injection 概念在 ViewModel 注入 business object
- branch_4: 利用 Interface
- branch_5_x: 使用 Koin
    - branch_5_1: 在 inject module 裡面處理完 injection
    - branch_5_2: 在 ViewModel 裡利用 Koin 完成 injection
- branch_6: 以 branch_4 為基礎，建立獨立的 business module
- branch_7: 以 branch_5_1 ，建立獨立的 business module 及其他需要的 modules.

------

# KoinSample

A sample project to introduce why and how to use Koin.
There are different phases to demo the progress from no injection concept at all, to using
Koin to achieve DI, which would be reveal in different branches.

## Branches
- branch_1: A simple demo project.
- branch_2: Wrap function by a functional component.
- branch_3: Inject business object to ViewModel.
- branch_4: Use Interface.
- branch_5_x: Use Koin.
    - branch_5_1: handle injection in inject module.
    - branch_5_2: Do injection by Koin in ViewModel.
- branch_6: Base on branch_4, create independent business module.
- branch_7: Base on branch_5_1, create independent business module and required modules.