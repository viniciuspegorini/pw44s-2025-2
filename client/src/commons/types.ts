export interface IUserRegister {
    displayName: string;
    username: string;
    password: string;
}

export interface IResponse {
    status?: number;
    success?: boolean;
    message?: string;
    data?: object
}

export interface IUserLogin {
    username: string;
    password: string;
}